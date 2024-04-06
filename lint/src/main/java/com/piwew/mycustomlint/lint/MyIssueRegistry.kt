package com.piwew.mycustomlint.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue

@Suppress("UnstableApiStage")
class MyIssueRegistry : IssueRegistry() {
    override val issues: List<Issue>
        get() = listOf(NamingPatternDetector.ISSUE_NAMING_PATTERN)

    override val api = CURRENT_API

    override val minApi: Int = 6
}