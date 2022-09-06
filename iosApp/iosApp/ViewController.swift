//
//  ViewController.swift
//  iosApp
//
//  Created by jamalping on 2022/9/5.
//

import UIKit

extension UIImage {
    
    convenience init(color: UIColor) {
        let rect = CGRect(x: 0.0, y: 0.0, width: 1.0, height: 1.0)
        UIGraphicsBeginImageContext(rect.size)
        let context = UIGraphicsGetCurrentContext()
        context?.setFillColor(color.cgColor)
        context?.fill(rect)
        let image = UIGraphicsGetImageFromCurrentImageContext()
        UIGraphicsEndImageContext()
        self.init(cgImage: (image?.cgImage)!)
    }
    
}

class ViewController: UIViewController {

    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        view.backgroundColor = UIColor .white
        
        title = "demo"
        
        let button = UIButton.init(type: .custom)
        button.frame = CGRect.init(x: 100, y: 150, width: 100, height: 30)
        button.backgroundColor = UIColor.red
        button.setTitle("数据存储", for: .normal)
        button.addTarget(self, action: #selector(buttonClick(button:)), for: .touchUpInside)
        view.addSubview(button);
        
        let button1 = UIButton.init(type: .custom)
        button1.frame = CGRect.init(x: 100, y: 200, width: 100, height: 30)
        button1.backgroundColor = UIColor.red
        button1.setTitle("网络请求", for: .normal)
        button1.addTarget(self, action: #selector(buttonClick1(button:)), for: .touchUpInside)
        view.addSubview(button1);
    }

    @objc func buttonClick(button: UIButton) {
        
        self.navigationController?.pushViewController(DataStorageVC(), animated: true)
    }

    @objc func buttonClick1(button: UIButton) {
        
        self.navigationController?.pushViewController(NetworkVC(), animated: true)
    }
}

