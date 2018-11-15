package com.appodeal.support.test

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.appodeal.ads.Appodeal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appKey = "0f79858b691749abc25b178cc3ab979d1cb307f775d19ac6"
        Appodeal.disableLocationPermissionCheck()
        Appodeal.setTesting(true)
        Appodeal.setBannerViewId(R.id.appodeal_banner_view)
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL or Appodeal.NATIVE or Appodeal.BANNER)



        btn_show_banner.setOnClickListener {
            Appodeal.show(this, Appodeal.BANNER_VIEW)
        }

        Appodeal.hide(this, Appodeal.BANNER_VIEW)


        Appodeal.show(this, Appodeal.INTERSTITIAL)
    }
}
