package net.codeinreal.projects.forecastmvvm.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import net.codeinreal.projects.forecastmvvm.R
import net.codeinreal.projects.forecastmvvm.base.BaseFragment
import net.codeinreal.projects.forecastmvvm.viewmodel.SettingViewModel

class SettingsFragment : BaseFragment() {
    override var layout = R.layout.future_list_fragment
    private lateinit var viewModel: SettingViewModel


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(SettingViewModel::class.java)
    }
}