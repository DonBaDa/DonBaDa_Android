package kr.puze.donbada.Server

import org.json.JSONArray

/**
 * Created by parktaejun on 2018. 1. 21..
 */
class Schema {
    data class User(var _id: String, var id: String, var fb_token: String, var name: String, var birth: String, var phone: String, var picture: String, var debt_rooms: String, var credit_rooms: String)
    data class Room(var creditor: User, var debtor: User, var D_day: String, var amount: String, var isEnd: Boolean)

}