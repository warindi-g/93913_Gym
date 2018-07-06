package android.example.com.a93913_gym;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public class GithubClient {
    @GET("/showusers/{showusers}/repos")
    Call<List<GitHubRepo>> reposforUser(@Path("showusers") String showuser) {
        return null;
    }
}
