//
//  NetworkVC.swift
//  iosApp
//
//  Created by jamalping on 2022/9/5.
//

import UIKit
import shared
import HandyJSON


class NetworkVC: UIViewController {

    var tipLabel:UILabel!
    var tableView:UITableView!
    let greet = Greeting.init()
    var dataModel: DataModel?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        view.backgroundColor = UIColor.white
        /// 设置这个页面使用小标题
        self.navigationItem.largeTitleDisplayMode = .never
//        if #available(iOS 13.0, *) {
//            let navigationBarAppearance = UINavigationBarAppearance()
//            navigationBarAppearance.configureWithOpaqueBackground()
//            navigationBarAppearance.backgroundColor = .systemPurple
//            let nav = UINavigationBar.appearance()
//            nav.standardAppearance = navigationBarAppearance;
//            nav.compactAppearance = navigationBarAppearance;
//            nav.scrollEdgeAppearance = navigationBarAppearance;
//
//        } else {
//            let nav = UINavigationBar.appearance()
//            nav.titleTextAttributes = [NSAttributedString.Key.font:UIFont.systemFont(ofSize: 18),NSAttributedString.Key.foregroundColor:UIColor.black];
//            nav.setBackgroundImage(UIImage.init(color: .red), for: .any, barMetrics: .default)
//            nav.shadowImage = UIImage.init()
//            nav.isTranslucent = false
//        }
        
        
        title = "网络请求"
        
        tipLabel = UILabel.init(frame: CGRect.init(x: 100, y: 150, width: 100, height: 30))
        tipLabel.text = "loading..."
        tipLabel.textColor = UIColor.black
        tipLabel.center = view.center
        view.addSubview(tipLabel)
        
        tableView = UITableView.init(frame: self.view.bounds, style: .plain)
        tableView.rowHeight = 100
        tableView.delegate = self
        tableView.dataSource = self
        tableView.register(PriceCell.self, forCellReuseIdentifier: PriceCell.cellIdentfier)
        view.addSubview(tableView)
        
        view.bringSubviewToFront(tipLabel)
        
        fetchData()
    }
    
    func fetchData() {
        greet.greeting { json, error in
            if let result = json {
                
                self.dataModel = DataModel.deserialize(from: result)
                
                DispatchQueue.main.async {
                    self.view.bringSubviewToFront(self.tableView)
                    self.tableView.reloadData()
                }
            } else if let error = error {
                self.tipLabel.text = error.localizedDescription
            }
        }
    }


}

extension NetworkVC: UITableViewDelegate, UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return self.dataModel?.stocks?.first?.stockData?.count ?? 0
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell: PriceCell = tableView.dequeueReusableCell(withIdentifier: PriceCell.cellIdentfier) as! PriceCell
//        PriceCell.init(style: .default, reuseIdentifier: PriceCell.cellIdentfier)

        if let sdata = self.dataModel?.stocks?.first?.stockData?[indexPath.row] {
            cell.model = sdata
        }
        
        return cell
    }
    
    func tableView(_ tableView: UITableView, viewForHeaderInSection section: Int) -> UIView? {
        let label = UILabel.init(frame: CGRect.init(x: 0, y: 0, width: tableView.frame.width, height: 50))
        label.backgroundColor = UIColor.gray.withAlphaComponent(0.3)
        if let symbol = self.dataModel?.stocks?.first?.symbol {
            label.text = "港股代码NO.:\(symbol)"
            return label
        }

        return nil
    }
}


