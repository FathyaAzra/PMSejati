package net.fazra.pmsejati.Domain

import android.icu.text.CaseMap.Title

data class OngoingDomain(
    var title: String,
    var data: String,
    var progressPercent: Int,
    var picPath:String,
)
