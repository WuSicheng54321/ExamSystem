package com.wsc.service.impl;

import com.wsc.pojo.Paper;
import com.wsc.pojo.Question;
import com.wsc.pojo.Subject;
import com.wsc.service.inter.ITestDBService;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ClientRequestInfoOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by wsc on 17-1-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class TestDBServiceImplTest {

    private static final Logger LOGGER= LoggerFactory.getLogger(TestDBServiceImplTest.class);

    @Resource
    private ITestDBService iTestDBService;

    @Test
    public void createQuestion() throws Exception {
        Question question=new Question(1,1,"question_title","question_text","question_answer","question_right",1,1,new Date(),new Date(),1);
        iTestDBService.createQuestion(question);
    }

    @Test
    public void createQuestionList() throws Exception {
        List<Question> questions=new ArrayList<>();
        questions.add(new Question(2,1,"question_title","question_text","question_answer","question_right",1,1,new Date(),new Date(),1));
        questions.add(new Question(3,1,"question_title","question_text","question_answer","question_right",1,1,new Date(),new Date(),1));
        iTestDBService.createQuestionList(questions);
    }

    @Test
    public void deleteQuestion() throws Exception {
        iTestDBService.deleteQuestion(1);
    }

    @Test
    public void updateQuestion() throws Exception {
        Question question=new Question(1,1,"question-change1231","question_text","question_answer","question_right",1,1,new Date(),new Date(),1);
        iTestDBService.updateQuestion(2,question);
    }

    @Test
    public void queryQuestion() throws Exception {
        Question question=iTestDBService.queryQuestion(1);
        LOGGER.info(question.toString());
    }

    @Test
    public void queryQuestionByQuestionType() throws Exception {
        List<Question> questions = iTestDBService.queryQuestionByQuestionType( 1);
        LOGGER.info(questions.toString());
    }
    @Test
    public void queryQuestionList() throws Exception {
        List<Question> questions=iTestDBService.queryQuestionList(1,3);
        LOGGER.info(questions.toString());
    }

    @Test
    public void queryQuestionListBySubject() throws Exception {
        List<Question> questions=iTestDBService.queryQuestionListBySubject(1);
        LOGGER.info(questions.toString());
    }

    @Test
    public void outPutQuestionBySubject() throws Exception {

    }

    @Test
    public void inputQuesrtionByExcel() throws Exception {

    }

    @Test
    public void createPaper() throws Exception {
        Paper paper=new Paper(5,"12",new Date(),new Date(),1,1,new Date(),new Date());
        iTestDBService.createPaper(paper);
    }

    @Test
    public void createPaperTemple1() throws Exception {

    }

    @Test
    public void createPaperTemple2() throws Exception {

    }

    @Test
    public void createPaperTemple3() throws Exception {

    }

    @Test
    public void deletePaper() throws Exception {
        iTestDBService.deletePaper(1);
    }

    @Test
    public void updatePaper() throws Exception {
        Paper paper=new Paper(5,"change1",new Date(),new Date(),1,1,new Date(),new Date());
        iTestDBService.updatePaper(5,paper);
        //ERROR
    }

    @Test
    public void queryPaper() throws Exception {
        Paper paper=iTestDBService.queryPaper(2);
        LOGGER.info(paper.toString());
    }

    @Test
    public void queryPaperList() throws Exception {
        List<Paper> list=iTestDBService.queryPaperList(1,2);
        LOGGER.info(list.toString());
    }

    @Test
    public void queryPaperBySubjectId() throws Exception {
        List<Paper> list=iTestDBService.queryPaperBySubjectId(2);
        LOGGER.info(list.toString());
    }

    @Test
    public void outputPaperByPaperId() throws Exception {

    }

    @Test
    public void createSubject() throws Exception {
        Subject subject=new Subject(2,"subjectName3",new Date(),new Date(),1);
        iTestDBService.createSubject(subject);
    }

    @Test
    public void deleteSubject() throws Exception {
        Subject subject=iTestDBService.deleteSubject(1);
        LOGGER.info(subject.toString());
    }

    @Test
    public void updateSubject() throws Exception {
        Subject subject=new Subject(3,"change",new Date(),new Date(),1);
        Subject subjectRe=iTestDBService.updateSubject(subject);
        LOGGER.info(subjectRe.toString());
    }

    @Test
    public void querySubject() throws Exception {
        Subject subject=iTestDBService.querySubject(2);
        LOGGER.info(subject.toString());
    }

    @Test
    public void querySubjectList() throws Exception {
        Set<Subject> subjects=iTestDBService.querySubjectList(1,2);
        LOGGER.info(subjects.toString());
    }

    public void test(){
        Question question=new Question();
        try {
            LOGGER.info(String.valueOf(TestDBServiceImpl.judgeQuestionNull(question)));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}