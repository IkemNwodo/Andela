package com.ikem.nwodo.andela.pageArrays;

import android.support.v4.app.Fragment;

import com.ikem.nwodo.andela.pages.DataStructureAlgorithms.IntroductionToAlgorithms;
import com.ikem.nwodo.andela.pages.DataStructureAlgorithms.IntroductionToDataStructures;
import com.ikem.nwodo.andela.pages.DataStructureAlgorithms.JavascriptDataStructures;
import com.ikem.nwodo.andela.pages.DataStructureAlgorithms.OverviewDataStructure;
import com.ikem.nwodo.andela.pages.IntroductionToES6.FirstLookAtES6;
import com.ikem.nwodo.andela.pages.IntroductionToES6.IntroductionToES6;
import com.ikem.nwodo.andela.pages.IntroductionToES6.OverviewES6;
import com.ikem.nwodo.andela.pages.IntroductionToProgramming.ComputerScienceBasics;
import com.ikem.nwodo.andela.pages.IntroductionToProgramming.IntroductionToJavaScript;
import com.ikem.nwodo.andela.pages.IntroductionToProgramming.OverviewProgramming;
import com.ikem.nwodo.andela.pages.IntroductionToProgramming.ProgrammingBasics;
import com.ikem.nwodo.andela.pages.OOP.ObjectOrientedInJavascript;
import com.ikem.nwodo.andela.pages.OOP.OverviewOOP;
import com.ikem.nwodo.andela.pages.OOP.WhatIsObjectOrientedProgramming;
import com.ikem.nwodo.andela.pages.TestDrivenDevelopment.DebuggingInJavascript;
import com.ikem.nwodo.andela.pages.TestDrivenDevelopment.IntroductionToTDD;
import com.ikem.nwodo.andela.pages.TestDrivenDevelopment.OverviewTDD;
import com.ikem.nwodo.andela.pages.TestDrivenDevelopment.TDDInJavascript;
import com.ikem.nwodo.andela.pages.WebProgramming.HtmlAndCssPractical;
import com.ikem.nwodo.andela.pages.WebProgramming.HttpAndWebServices;
import com.ikem.nwodo.andela.pages.WebProgramming.IntroductionToNodeJS;
import com.ikem.nwodo.andela.pages.WebProgramming.IntroductionToREACT;
import com.ikem.nwodo.andela.pages.WebProgramming.IntroductionToWebProgramming;
import com.ikem.nwodo.andela.pages.WebProgramming.OverviewWebProgramming;

public class JavaScriptArray {

    public static Fragment[] programming = {
            new OverviewProgramming(),
            new ComputerScienceBasics(),
            new ProgrammingBasics(),
            new IntroductionToJavaScript()
    };

    public static Fragment[] OOP = {
            new OverviewOOP(),
            new WhatIsObjectOrientedProgramming(),
            new ObjectOrientedInJavascript()
    };

    public static Fragment[] dataStructuresAlgorithms = {
            new OverviewDataStructure(),
            new IntroductionToDataStructures(),
            new JavascriptDataStructures(),
            new IntroductionToAlgorithms()
    };

    public static Fragment[] ttd = {
            new OverviewTDD(),
            new IntroductionToTDD(),
            new TDDInJavascript(),
            new DebuggingInJavascript()
    };

    public static Fragment[] webProgramming = {
            new OverviewWebProgramming(),
            new IntroductionToWebProgramming(),
            new HttpAndWebServices(),
            new HtmlAndCssPractical(),
            new IntroductionToREACT(),
            new IntroductionToNodeJS()
    };

    public static Fragment[] es6 = {
            new OverviewES6(),
            new IntroductionToES6(),
            new FirstLookAtES6()
    };
}
