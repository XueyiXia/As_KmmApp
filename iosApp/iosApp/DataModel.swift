//
//  DataModel.swift
//  iosApp
//
//  Created by jamalping on 2022/9/5.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import HandyJSON

struct sData: HandyJSON {
    var tt: String?
    var O: String?
    var H: String?
    var L: String?
    var C: String?
    var V: String?
    var T: String?
    var lt: String?
}

struct Stock: HandyJSON {
    var symbol: String?
    var pc: String?
    var interval: String?
    var maxPeriod: String?
    var tradingDate: String?
    var stockData: [sData]?
    
    mutating func mapping(mapper: HelpingMapper){
        mapper.specify(property: &stockData, name: "data")
//        mapper <<< self.stockData <-- "data"
    }

}

struct DataModel: HandyJSON {
    internal init(){}
    var status: String?
    var stocks: [Stock]?
}
