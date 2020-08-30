package com.ali.simplecalculator.ui.presenter

import com.ali.simplecalculator.model.CalcModel
import com.ali.simplecalculator.ui.CalcPresenter
import com.ali.simplecalculator.ui.view.ICalcView

object PresenterInjector {



    fun injectPresenter(iCalcView: ICalcView):CalcPresenter {


        return  CalcPresenter(iCalcView, CalcModel())
    }
}