package chapter05;

import common.Log;
import okhttp3.*;

import java.io.IOException;

public class Code_n14p187s01_CallbackHell {

    private static final OkHttpClient client = new OkHttpClient();

    public static final String GITHUB_ROOT = "https://raw.githubusercontent.com/yudong80/reactivejava/master/";

    public static final String FIRST_URL = "https://api.github.com/zen";
    public static final String SECOND_URL = GITHUB_ROOT + "/samples/callback_hell";

    public static void main(String[] args) {
        Request request = new Request.Builder()
                .url(FIRST_URL)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.i(response.body().string());

                Request request = new Request.Builder()
                        .url(SECOND_URL)
                        .build();

                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        Log.i(response.body().string());
                    }
                });
            }
        });
    }
}
