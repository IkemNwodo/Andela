package com.ikem.nwodo.andela.pageArrays;

import android.support.v4.app.Fragment;

import com.ikem.nwodo.andela.pages.GitAndVersionControl.CommandLineBasics;
import com.ikem.nwodo.andela.pages.GitAndVersionControl.OverviewGit;
import com.ikem.nwodo.andela.pages.GitAndVersionControl.VersionControlWithGit;
import com.ikem.nwodo.andela.pages.Integration.Adaptability;
import com.ikem.nwodo.andela.pages.Integration.Collaboration;
import com.ikem.nwodo.andela.pages.Integration.Excellence;
import com.ikem.nwodo.andela.pages.Integration.GrowthMindset;
import com.ikem.nwodo.andela.pages.Integration.Integrity;
import com.ikem.nwodo.andela.pages.Integration.OverviewIntegration;
import com.ikem.nwodo.andela.pages.Integration.Passion;
import com.ikem.nwodo.andela.pages.Integration.RelationshipBuilding;
import com.ikem.nwodo.andela.pages.WinningWithPeople.AskingQuestions;
import com.ikem.nwodo.andela.pages.WinningWithPeople.BigPictureThinking;
import com.ikem.nwodo.andela.pages.WinningWithPeople.BusinessEtiquette;
import com.ikem.nwodo.andela.pages.WinningWithPeople.Ethics;
import com.ikem.nwodo.andela.pages.WinningWithPeople.LearningHowToLearn;
import com.ikem.nwodo.andela.pages.WinningWithPeople.OverviewWinningWithPeople;
import com.ikem.nwodo.andela.pages.WinningWithPeople.ProblemSolving;
import com.ikem.nwodo.andela.pages.WinningWithPeople.ProjectManagementTools;
import com.ikem.nwodo.andela.pages.WinningWithPeople.SeeksFeedback;
import com.ikem.nwodo.andela.pages.WinningWithPeople.SpeakingToBeUnderstood;
import com.ikem.nwodo.andela.pages.WinningWithPeople.WritingProfessionally;
import com.ikem.nwodo.andela.pages.database.IntroductionToDatabase;
import com.ikem.nwodo.andela.pages.database.OverviewDatabase;

public class CoreArray{

    public static Fragment[] integration = {
            new OverviewIntegration(),
            new Excellence(),
            new Passion(),
            new Integrity(),
            new Collaboration(),
            new GrowthMindset(),
            new RelationshipBuilding(),
            new Adaptability()
    };

    public static Fragment[] git = {
            new OverviewGit(),
            new CommandLineBasics(),
            new VersionControlWithGit()
    };

    public static Fragment[] Winning = {
            new OverviewWinningWithPeople(),
            new SpeakingToBeUnderstood(),
            new com.ikem.nwodo.andela.pages.WinningWithPeople.GrowthMindset(),
            new LearningHowToLearn(),
            new SeeksFeedback(),
            new BigPictureThinking(),
            new WritingProfessionally(),
            new ProjectManagementTools(),
            new ProblemSolving(),
            new BusinessEtiquette(),
            new AskingQuestions(),
            new Ethics()
    };

    public static Fragment[] databases = {
           new OverviewDatabase(),
           new IntroductionToDatabase()
    };




}