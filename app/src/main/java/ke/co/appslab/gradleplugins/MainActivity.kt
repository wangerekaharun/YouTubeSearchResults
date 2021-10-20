/*
 * Copyright 2021 GradleBuildPlugins
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ke.co.appslab.gradleplugins

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import ke.co.appslab.gradleplugins.ui.YouTubeAdapter
import ke.co.appslab.gradleplugins.ui.YouTubePlayerActivity
import ke.co.appslab.gradleplugins.ui.YouTubeViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 *  Main Activity which is the Launcher Activity
 */

class MainActivity : AppCompatActivity() {
    private val youTubeAdapter = YouTubeAdapter { showVideo(it)}
    private val viewModel:YouTubeViewModel by lazy { ViewModelProvider(this).get(YouTubeViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fetchVideos()
    }

    private fun fetchVideos() {
        lifecycleScope.launch {
            viewModel.fetchVideos().collectLatest {
                youTubeAdapter.submitData(it)
            }
        }
    }

    private fun showVideo(video: String) {
        val intent = Intent(this, YouTubePlayerActivity::class.java)
        intent.putExtra("video",video)
        startActivity(intent)
    }
}