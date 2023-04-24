package com.example.whatsappclone.model

data class ChatList(
    var userId : String,
    var userName : String,
    var description : String,
    var date : String,
    var urlProfile : String
)  : java.io.Serializable{
}