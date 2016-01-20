/********************************************************************************
 ** Form generated from reading ui file 'Abfuell_GUI.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Form implements com.trolltech.qt.QUiForm<QWidget>
{
    public QWidget horizontalLayoutWidget;
    public QHBoxLayout horizontalLayout;
    public QLabel label_4;
    public QProgressBar bier;
    public QFrame line;
    public QLabel label_3;
    public QProgressBar rum;
    public QFrame line_2;
    public QLabel label_2;
    public QProgressBar vodka;
    public QFrame line_3;
    public QLabel label;
    public QProgressBar wein;
    public QWidget horizontalLayoutWidget_2;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_5;
    public QProgressBar tisch1;
    public QFrame line_4;
    public QLabel label_6;
    public QProgressBar tisch2;
    public QFrame line_5;
    public QLabel label_7;
    public QProgressBar tisch3;
    public QFrame line_6;
    public QLabel label_8;
    public QProgressBar tisch4;
    public QFrame line_7;
    public QLabel label_9;
    public QProgressBar tisch5;
    public QLCDNumber dajma;

    public Ui_Form() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(1081, 680).expandedTo(Form.minimumSizeHint()));
        horizontalLayoutWidget = new QWidget(Form);
        horizontalLayoutWidget.setObjectName("horizontalLayoutWidget");
        horizontalLayoutWidget.setGeometry(new QRect(0, 0, 1081, 151));
        horizontalLayout = new QHBoxLayout(horizontalLayoutWidget);
        horizontalLayout.setObjectName("horizontalLayout");
        label_4 = new QLabel(horizontalLayoutWidget);
        label_4.setObjectName("label_4");

        horizontalLayout.addWidget(label_4);

        bier = new QProgressBar(horizontalLayoutWidget);
        bier.setObjectName("bier");
        bier.setValue(24);

        horizontalLayout.addWidget(bier);

        line = new QFrame(horizontalLayoutWidget);
        line.setObjectName("line");
        line.setFrameShape(QFrame.Shape.VLine);

        horizontalLayout.addWidget(line);

        label_3 = new QLabel(horizontalLayoutWidget);
        label_3.setObjectName("label_3");

        horizontalLayout.addWidget(label_3);

        rum = new QProgressBar(horizontalLayoutWidget);
        rum.setObjectName("rum");
        rum.setValue(24);

        horizontalLayout.addWidget(rum);

        line_2 = new QFrame(horizontalLayoutWidget);
        line_2.setObjectName("line_2");
        line_2.setFrameShape(QFrame.Shape.VLine);

        horizontalLayout.addWidget(line_2);

        label_2 = new QLabel(horizontalLayoutWidget);
        label_2.setObjectName("label_2");

        horizontalLayout.addWidget(label_2);

        vodka = new QProgressBar(horizontalLayoutWidget);
        vodka.setObjectName("vodka");
        vodka.setValue(24);

        horizontalLayout.addWidget(vodka);

        line_3 = new QFrame(horizontalLayoutWidget);
        line_3.setObjectName("line_3");
        line_3.setFrameShape(QFrame.Shape.VLine);

        horizontalLayout.addWidget(line_3);

        label = new QLabel(horizontalLayoutWidget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        wein = new QProgressBar(horizontalLayoutWidget);
        wein.setObjectName("wein");
        wein.setValue(24);

        horizontalLayout.addWidget(wein);

        horizontalLayoutWidget_2 = new QWidget(Form);
        horizontalLayoutWidget_2.setObjectName("horizontalLayoutWidget_2");
        horizontalLayoutWidget_2.setGeometry(new QRect(0, 430, 1081, 251));
        horizontalLayout_4 = new QHBoxLayout(horizontalLayoutWidget_2);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_5 = new QLabel(horizontalLayoutWidget_2);
        label_5.setObjectName("label_5");

        horizontalLayout_4.addWidget(label_5);

        tisch1 = new QProgressBar(horizontalLayoutWidget_2);
        tisch1.setObjectName("tisch1");
        tisch1.setValue(24);

        horizontalLayout_4.addWidget(tisch1);

        line_4 = new QFrame(horizontalLayoutWidget_2);
        line_4.setObjectName("line_4");
        line_4.setFrameShape(QFrame.Shape.VLine);

        horizontalLayout_4.addWidget(line_4);

        label_6 = new QLabel(horizontalLayoutWidget_2);
        label_6.setObjectName("label_6");

        horizontalLayout_4.addWidget(label_6);

        tisch2 = new QProgressBar(horizontalLayoutWidget_2);
        tisch2.setObjectName("tisch2");
        tisch2.setValue(24);

        horizontalLayout_4.addWidget(tisch2);

        line_5 = new QFrame(horizontalLayoutWidget_2);
        line_5.setObjectName("line_5");
        line_5.setFrameShape(QFrame.Shape.VLine);

        horizontalLayout_4.addWidget(line_5);

        label_7 = new QLabel(horizontalLayoutWidget_2);
        label_7.setObjectName("label_7");

        horizontalLayout_4.addWidget(label_7);

        tisch3 = new QProgressBar(horizontalLayoutWidget_2);
        tisch3.setObjectName("tisch3");
        tisch3.setValue(24);

        horizontalLayout_4.addWidget(tisch3);

        line_6 = new QFrame(horizontalLayoutWidget_2);
        line_6.setObjectName("line_6");
        line_6.setFrameShape(QFrame.Shape.VLine);

        horizontalLayout_4.addWidget(line_6);

        label_8 = new QLabel(horizontalLayoutWidget_2);
        label_8.setObjectName("label_8");

        horizontalLayout_4.addWidget(label_8);

        tisch4 = new QProgressBar(horizontalLayoutWidget_2);
        tisch4.setObjectName("tisch4");
        tisch4.setValue(24);

        horizontalLayout_4.addWidget(tisch4);

        line_7 = new QFrame(horizontalLayoutWidget_2);
        line_7.setObjectName("line_7");
        line_7.setFrameShape(QFrame.Shape.VLine);

        horizontalLayout_4.addWidget(line_7);

        label_9 = new QLabel(horizontalLayoutWidget_2);
        label_9.setObjectName("label_9");

        horizontalLayout_4.addWidget(label_9);

        tisch5 = new QProgressBar(horizontalLayoutWidget_2);
        tisch5.setObjectName("tisch5");
        tisch5.setValue(24);

        horizontalLayout_4.addWidget(tisch5);

        dajma = new QLCDNumber(Form);
        dajma.setObjectName("dajma");
        dajma.setGeometry(new QRect(220, 230, 551, 131));
        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Bier:", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Rum:", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Vodka:", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Wein:", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Tisch 1", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Tisch 2", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Tisch 3", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Tisch 4", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Tisch 5", null));
    } // retranslateUi

}

