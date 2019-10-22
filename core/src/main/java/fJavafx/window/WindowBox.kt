package fJavafx.window

import javafx.scene.Node
import javafx.scene.Parent
import javafx.scene.layout.HBox

/**
 * @author Explo
 */
class WindowBox(child:Node) :Parent(){
    private val window by lazy {
        HBox()
    }
    init {
        children.add(window)
    }


}