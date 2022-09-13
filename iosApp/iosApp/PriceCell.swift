//
//  PriceCell.swift
//  iosApp
//
//  Created by jamalping on 2022/9/6.
//

import UIKit

class PriceCell: UITableViewCell {
    
    var model: sData? {
        didSet {
            if let h = model?.H, let o = model?.O, let c = model?.C {
                self.hLabel.text = "最高价格：\(h) 港币"
                self.mLabel.text = "中间价格：\(o) 港币"
                self.cLabel.text = "成交价格：\(c) 港币"
            }
            
        }
    }
    
    override init(style: UITableViewCell.CellStyle, reuseIdentifier: String?) {
        super.init(style: style, reuseIdentifier: reuseIdentifier)
        self.selectionStyle = .none
        
        configPage()
    }
    
    required init?(coder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    func configPage() {
        self.contentView.addSubview(self.hLabel)
        self.contentView.addSubview(self.mLabel)
        self.contentView.addSubview(self.cLabel)
        
        self.mLabel.frame = CGRect.init(x: 0, y: 0, width: contentView.frame.width, height: 30)
        self.hLabel.frame = CGRect.init(x: 0, y: 30, width: contentView.frame.width, height: 30)
        self.cLabel.frame = CGRect.init(x: 0, y: 60, width: contentView.frame.width, height: 30)
    }
    
    lazy var hLabel: UILabel = {
        let label = UILabel.init()
        label.font = UIFont.systemFont(ofSize: 15)
        label.textColor = UIColor.blue
        return label
    }()
    
    lazy var mLabel: UILabel = {
        let label = UILabel.init()
        label.font = UIFont.systemFont(ofSize: 15)
        label.textColor = UIColor.black
        return label
    }()
    
    lazy var cLabel: UILabel = {
        let label = UILabel.init()
        label.font = UIFont.systemFont(ofSize: 15)
        label.textColor = UIColor.gray.withAlphaComponent(0.5)
        return label
    }()
}
