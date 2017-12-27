package com.kotto.angelica;

import com.kotto.angelica.gsCalendar.gsCalendarColorParam;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
		
public class type3 extends Activity 
{
 
	TextView tvs[] ;
	Button btns[] ;
    

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.set2);
        
        /// �޷��� ��� ��� ���̾ƿ�
        LinearLayout lv = (LinearLayout)findViewById( R.id.calendar_lLayout ) ;
        
        /// �� �� �� ǥ���� �ؽ�Ʈ��
        tvs = new TextView[3] ;
        tvs[0] = (TextView)findViewById( R.id.tv1 ) ;
        tvs[1] = (TextView)findViewById( R.id.tv2 ) ;
        tvs[2] = null ; /// ���� ǥ������ ����
        
        /// ������ �� �� �� ������ ��ư
        btns = new Button[4] ;
        btns[0] = null ; // �⵵�� �������� ����
        btns[1] = null ; // ���� ����
        btns[2] = (Button)findViewById( R.id.Button03 ) ;
        btns[3] = (Button)findViewById( R.id.Button04 ) ;
        
        /// �޷°�ü ����
        gsCalendar cal = new gsCalendar( this, lv ) ;
        
        /// ���� ������ ��ü ����
        gsCalendarColorParam cParam = new gsCalendarColorParam( ) ;
        
        cParam.m_cellColor = 0x00000000 ;
        cParam.m_textColor = 0xffffffff ;
        cParam.m_saturdayTextColor = 0xff33ccff ;
        cParam.m_lineColor = 0x99999999 ;
        cParam.m_topCellColor = 0xff003333 ;
        cParam.m_topTextColor = 0xffffffff ;
        cParam.m_topSundayTextColor = 0xffffffff ;
        cParam.m_topSaturdatTextColor = 0xffffffff ;
        
        /// ������ ������ ���� ��~
        cal.setColorParam( cParam ) ;
        
        /// ������� ����� �̹��� ���
        Drawable img = getResources( ).getDrawable( R.drawable.bg ) ;
        // ��� �̹��� ��~
        cal.setBackground( img ) ;
        
        /// �޷��� ��� ũ�� ����
        cal.setCalendarSize( 478, 600 ) ;
        
        /// �ֻ���� ���̸� 35�� �ش�(��ü������ �� ���� ���� 600/7�� ������ 35�� ����Ǵ� �޷��� �� ���̰� �پ���.)
        cal.setTopCellSize( 35 ) ;
        
        /// ������ ������ ��ư�� ����
        cal.setControl( btns ) ;
        
        /// �� �� ���� ��� �ؽ�Ʈ�� ����
        cal.setViewTarget( tvs ) ;
        
        cal.initCalendar( ) ;
        
        
        
    }

}