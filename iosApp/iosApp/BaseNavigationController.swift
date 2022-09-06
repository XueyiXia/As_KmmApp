//
//  BaseNavigationController.swift
//  iosApp
//
//  Created by jamalping on 2022/9/6.
//

import UIKit

class BaseNavigationController: UINavigationController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        if #available(iOS 13.0, *) {
            let navigationBarAppearance = UINavigationBarAppearance()
            navigationBarAppearance.configureWithOpaqueBackground()
            navigationBarAppearance.backgroundColor = .white
            let nav = UINavigationBar.appearance()
            nav.standardAppearance = navigationBarAppearance;
            nav.compactAppearance = navigationBarAppearance;
            nav.scrollEdgeAppearance = navigationBarAppearance;
            
        }
        self.navigationBar.prefersLargeTitles = false
//        self.edgesForExtendedLayout = UIRectEdge.all
//        self.navigationBar
//        
//        let nav = UINavigationBar.appearance()
//        nav.titleTextAttributes = [NSAttributedString.Key.font:UIFont.systemFont(ofSize: 18),NSAttributedString.Key.foregroundColor:UIColor.white];
//        nav.setBackgroundImage(UIImage.init(color: .white), for: .any, barMetrics: .default)
//        nav.shadowImage = UIImage.init()
//        nav.isTranslucent = false
        
        self.navigationItem.largeTitleDisplayMode = .never
        if #available(iOS 11.0, *) {
//            UINavigationBar.appearance().prefersLargeTitles = false
//            UINavigationBar.appearance()
            //                [[UINavigationBar appearance] setPrefersLargeTitles: false];
        } else {
            // Fallback on earlier versions
        }
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    override func pushViewController(_ viewController: UIViewController, animated: Bool) {
        
        if children.count >= 1 {
            viewController.hidesBottomBarWhenPushed = true
        }
        viewController.view.backgroundColor = UIColor.white
        super.pushViewController(viewController, animated: true)
    }
    
    func back() {
        self.popViewController(animated: true)
    }
}
