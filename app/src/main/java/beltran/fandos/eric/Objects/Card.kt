package beltran.fandos.eric.Objects

import android.widget.ImageView
import java.io.Serializable

class Card constructor(
    var idCard: String,
    var titleCard: String,
    var imgCard: String,
    var descCard: String
): Serializable