package com.onmycrowd.recharge.test

import android.os.Bundle
import cucumber.api.CucumberOptions
import cucumber.api.android.CucumberAndroidJUnitRunner


@CucumberOptions(
        features = ["features"],
        glue = ["com.onmycrowd.recharge.users.ui"],
        plugin = ["pretty"])
class FirstConfig