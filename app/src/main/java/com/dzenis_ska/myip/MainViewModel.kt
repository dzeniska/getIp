package com.dzenis_ska.myip

import android.util.Log
import androidx.lifecycle.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val apiIP = ApiForIP.create()

    private val _launchApi = MutableLiveData<String?>()
    val launchApi: LiveData<String?> = _launchApi



    fun getIp(){
        viewModelScope.launch {
            delay(1000)
            _launchApi.value = try {
                val apiC = apiIP.getIp()
                Log.d("!!!", "${apiC.ip}_${apiC.xForwardedFor}")
                apiC.ip
            } catch (e: Exception) {
                "empty ${e}"
            }
        }
    }
}