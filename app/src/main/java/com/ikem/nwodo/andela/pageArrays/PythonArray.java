package com.ikem.nwodo.andela.pageArrays;

import android.support.v4.app.Fragment;

import com.ikem.nwodo.andela.pages.DataStructureAlgorithms.IntroductionToAlgorithms;
import com.ikem.nwodo.andela.pages.DataStructureAlgorithms.IntroductionToDataStructures;
import com.ikem.nwodo.andela.pages.DataStructureAlgorithms.OverviewDataStructure;
import com.ikem.nwodo.andela.pages.DataStructureAlgorithms.PythonDataStructures;
import com.ikem.nwodo.andela.pages.IntroductionToProgramming.ComputerScienceBasics;
import com.ikem.nwodo.andela.pages.IntroductionToProgramming.IntroductionToPython;
import com.ikem.nwodo.andela.pages.IntroductionToProgramming.OverviewProgramming;
import com.ikem.nwodo.andela.pages.IntroductionToProgramming.ProgrammingBasics;
import com.ikem.nwodo.andela.pages.OOP.ObjectOrientedInPython;
import com.ikem.nwodo.andela.pages.OOP.OverviewOOP;
import com.ikem.nwodo.andela.pages.OOP.WhatIsObjectOrientedProgramming;
import com.ikem.nwodo.andela.pages.TestDrivenDevelopment.DebuggingInPython;
import com.ikem.nwodo.andela.pages.TestDrivenDevelopment.IntroductionToTDD;
import com.ikem.nwodo.andela.pages.TestDrivenDevelopment.OverviewTDD;
import com.ikem.nwodo.andela.pages.TestDrivenDevelopment.TDDInPython;
import com.ikem.nwodo.andela.pages.WebProgramming.BasicsOfMVCArchitecture;
import com.ikem.nwodo.andela.pages.WebProgramming.GettingStartedWithFlask;
import com.ikem.nwodo.andela.pages.WebProgramming.HtmlAndCssPractical;
import com.ikem.nwodo.andela.pages.WebProgramming.HttpAndWebServices;
import com.ikem.nwodo.andela.pages.WebProgramming.IntroductionToREACT;
import com.ikem.nwodo.andela.pages.WebProgramming.IntroductionToWebProgramming;
import com.ikem.nwodo.andela.pages.WebProgramming.OverviewWebProgramming;

public class PythonArray {

    public static Fragment[] programming = {
            new OverviewProgramming(),
            new ComputerScienceBasics(),
            new ProgrammingBasics(),
            new IntroductionToPython()
    };

    public static Fragment[] OOP = {
            new OverviewOOP(),
            new WhatIsObjectOrientedProgramming(),
            new ObjectOrientedInPython()
    };

    public static Fragment[] dataStructuresAlgorithms = {
            new OverviewDataStructure(),
            new IntroductionToDataStructures(),
            new PythonDataStructures(),
            new IntroductionToAlgorithms()
    };

    public static Fragment[] tdd = {
            new OverviewTDD(),
            new IntroductionToTDD(),
            new TDDInPython(),
            new DebuggingInPython()
    };

    public static Fragment[] webProgramming = {
            new OverviewWebProgramming(),
            new IntroductionToWebProgramming(),
            new HttpAndWebServices(),
            new HtmlAndCssPractical(),
            new BasicsOfMVCArchitecture(),
            new GettingStartedWithFlask(),
            new IntroductionToREACT()
    };
}
