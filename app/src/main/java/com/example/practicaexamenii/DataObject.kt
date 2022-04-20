package com.example.practicaexamenii

object DataObject {
    var listdata = mutableListOf<InfoTareas>()

    fun setData(title: String, priority: String) {
        listdata.add(InfoTareas(title, priority))
    }

    fun getAllData(): List<InfoTareas> {
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos:Int): InfoTareas {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos:Int,title:String,priority:String)
    {
        listdata[pos].title=title
        listdata[pos].priority=priority
    }
}