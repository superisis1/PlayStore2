package kr.insungjung.playstorecopy2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.insungjung.playstorecopy2.adapter.AppAdapter;
import kr.insungjung.playstorecopy2.databinding.ActivityMainBinding;
import kr.insungjung.playstorecopy2.datas.App;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act;

    List<App> appList = new ArrayList<>();

    AppAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);

        fillApps();

        mAdapter = new AppAdapter(MainActivity.this, appList);
        act.appListView.setAdapter(mAdapter);
    }

    void fillApps() {
        appList.add(new App(1,"YAP(얍)-열두시 쿠폰에 스탬프", "(주)열두시","무료"));
        appList.add(new App(2,"배달음식 주문앱 요기요", "yogiyo.co.kr","설치된 항목"));
        appList.add(new App(3,"배달의민족(1등 배달음식 주문앱)", "Woowa Brothers","무료"));
        appList.add(new App(4,"직방 - 월세, 원룸", "CHBREEZE","설치된 항목"));
        appList.add(new App(5,"후후 - 스팸차단 & 전화번호 정보앱", "WhoWho Team","무료"));
        appList.add(new App(6,"스마트월렛 - Syrup으로 재탄생!", "Syrup","설치된 항목"));
        appList.add(new App(7,"트라하", "NEXON Company","무료"));
        appList.add(new App(8,"라이프애프터", "X.D. Global","무료"));
        appList.add(new App(9,"프렌즈타운", "KaKao Games Corp.","무료"));

    }
}
