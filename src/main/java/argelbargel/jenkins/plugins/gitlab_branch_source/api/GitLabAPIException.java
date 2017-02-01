package argelbargel.jenkins.plugins.gitlab_branch_source.api;

import java.io.IOException;

public final class GitLabAPIException extends IOException {
    GitLabAPIException(IOException e) {
        super("error accessing gitlab-api: " + e.getMessage(), e.getCause());
    }
}
