//
//  CellIdentfierable.swift
//  XPUtilExample
//
//  Created by Apple on 2018/12/18.
//  Copyright © 2018年 xyj. All rights reserved.
//

import UIKit

// MARK: - TableViewCell、CollectionViewCell，遵循Cell标志协议，实现为默认实现
extension UITableViewCell: Cellidentfierable {}

extension UICollectionViewCell: Cellidentfierable{}

extension UITableViewHeaderFooterView: Cellidentfierable{}

// MARK: - Cell标志协议
protocol Cellidentfierable {
    static var cellIdentfier: String { get }
}

extension Cellidentfierable where Self: UITableViewCell {
    static var cellIdentfier: String {
        return "\(self)"
    }
    
    var cellIdentfier: String {
        return Self.cellIdentfier
    }
}

extension Cellidentfierable where Self: UICollectionViewCell {
    static var cellIdentfier: String {
        return "\(self)"
    }
    
    var cellIdentfier: String {
        return Self.cellIdentfier
    }
}

extension Cellidentfierable where Self: UITableViewHeaderFooterView {
    static var cellIdentfier: String {
        return "\(self)"
    }
    
    var cellIdentfier: String {
        return Self.cellIdentfier
    }
}

