package com.example.yunwen.modejingdong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.example.yunwen.modejingdong.view.AuditProgressView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout content = (LinearLayout) findViewById(R.id.ll_audit_content);

        content.addView(createView(5, true, true, true, false, "提交申请"));
        content.addView(createView(5, true, true, false, false, "审查"));
        content.addView(createView(5, true, true, false, false, "审核"));
        content.addView(createView(5, true, false, false, false, "退款"));
        content.addView(createView(5, false, false, false, false, "完成"));
        content.addView(createView(5, false, false, false, true, "关闭"));
    }


    /**总共有几步——当前是否完成——下一个是否完成——是否是第一个——是否是最后一个——显示的文字*/
    public AuditProgressView createView(int stepCount, boolean isCurrentComplete,
                                        boolean isNextComplete, boolean isFirstStep, boolean isLastStep, String text) {
        /**自定义控件*/
        AuditProgressView view = new AuditProgressView(this);
        /**自定义控件的设置*/
        view.setStepCount(stepCount);
        view.setIsCurrentComplete(isCurrentComplete);
        view.setIsNextComplete(isNextComplete);
        view.setIsFirstStep(isFirstStep);
        view.setIsLastStep(isLastStep);
        view.setText(text);
        return view;
    }
}
