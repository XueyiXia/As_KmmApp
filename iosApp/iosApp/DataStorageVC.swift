//
//  DataStorageVC.swift
//  iosApp
//
//  Created by jamalping on 2022/9/5.
//


import UIKit
import shared

class DataStorageVC: UIViewController {

    var feild: UITextField!
    var feild1: UITextField!
    
    let platform = Platform()
    let dateKey = "dateKey"
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        view.backgroundColor = UIColor.white
        
        title = "数据存储"
        
        feild = UITextField.init(frame: CGRect.init(x: 100, y: 150, width: 200, height: 30))
        feild.placeholder = "请输入要存储的数据"
        view.addSubview(feild)
        
        let button = UIButton.init(type: .custom)
        button.frame = CGRect.init(x: 100, y: 200, width: 200, height: 30)
        button.backgroundColor = UIColor.red
        button.setTitle("存储", for: .normal)
        button.addTarget(self, action: #selector(buttonClick(button:)), for: .touchUpInside)
        view.addSubview(button);
        
        feild1 = UITextField.init(frame: CGRect.init(x: 100, y: 250, width: 200, height: 30))
        feild1.placeholder = "这里显示取出的数据"
        view.addSubview(feild1)
        
        let button1 = UIButton.init(type: .custom)
        button1.frame = CGRect.init(x: 100, y: 300, width: 200, height: 30)
        button1.backgroundColor = UIColor.red
        button1.setTitle("点击获取存储的数据", for: .normal)
        button1.addTarget(self, action: #selector(buttonClick1(button:)), for: .touchUpInside)
        view.addSubview(button1);

    }

    @objc func buttonClick(button: UIButton) {
        print("存数据：\(feild.text)")
        if let value = feild.text {
            platform.putString(key: dateKey, value: value)
        }else {
            platform.putString(key: dateKey, value: "")
        }
    }
    
    @objc func buttonClick1(button: UIButton) {
        let value = platform.getData(key: dateKey) ?? ""
        print("取出数据：\(value)")
        feild1.text = value
    }

}

