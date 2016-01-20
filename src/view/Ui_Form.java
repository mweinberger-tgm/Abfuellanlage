package view;

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
    public QProgressBar progressBar_2;
    public QProgressBar progressBar;
    public QLCDNumber lcdNumber;
    public QWidget verticalLayoutWidget;
    public QVBoxLayout verticalLayout;
    public QProgressBar progressBar_3;

    public Ui_Form() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(837, 527).expandedTo(Form.minimumSizeHint()));
        horizontalLayoutWidget = new QWidget(Form);
        horizontalLayoutWidget.setObjectName("horizontalLayoutWidget");
        horizontalLayoutWidget.setGeometry(new QRect(0, 0, 841, 151));
        horizontalLayout = new QHBoxLayout(horizontalLayoutWidget);
        horizontalLayout.setObjectName("horizontalLayout");
        progressBar_2 = new QProgressBar(horizontalLayoutWidget);
        progressBar_2.setObjectName("progressBar_2");
        progressBar_2.setValue(24);

        horizontalLayout.addWidget(progressBar_2);

        progressBar = new QProgressBar(horizontalLayoutWidget);
        progressBar.setObjectName("progressBar");
        progressBar.setValue(24);

        horizontalLayout.addWidget(progressBar);

        lcdNumber = new QLCDNumber(Form);
        lcdNumber.setObjectName("lcdNumber");
        lcdNumber.setGeometry(new QRect(390, 210, 64, 23));
        verticalLayoutWidget = new QWidget(Form);
        verticalLayoutWidget.setObjectName("verticalLayoutWidget");
        verticalLayoutWidget.setGeometry(new QRect(0, 280, 841, 251));
        verticalLayout = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout.setObjectName("verticalLayout");
        progressBar_3 = new QProgressBar(verticalLayoutWidget);
        progressBar_3.setObjectName("progressBar_3");
        progressBar_3.setValue(24);

        verticalLayout.addWidget(progressBar_3);

        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Abfüllanlage", null));
    } // retranslateUi

}

