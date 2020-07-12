package net.codeinreal.projects.forecastmvvm.weather.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import net.codeinreal.projects.forecastmvvm.R
import net.codeinreal.projects.forecastmvvm.base.BaseFragment
import net.codeinreal.projects.forecastmvvm.weather.viewmodel.CurrentWeatherViewModel

class FutureListFragment() : BaseFragment() {

    override var layout: Int = R.layout.future_list_fragment
    private lateinit var viewModel: CurrentWeatherViewModel

    companion object {
        fun newInstance() =
            FutureListFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrentWeatherViewModel::class.java)
    }

}