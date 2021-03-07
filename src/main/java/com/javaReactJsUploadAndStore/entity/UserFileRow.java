package com.javaReactJsUploadAndStore.entity;
import javax.persistence.*;
import static javax.persistence.GenerationType.SEQUENCE;

//Modified to represent 10 columns of same excel file row

@Entity
@Table(name = "user_data")
public class UserFileRow {

    @Id
    //Sequecse generating strategy increases the performance of batch operation
    @GeneratedValue(strategy = SEQUENCE, generator = "seqGen")
    @SequenceGenerator(name = "seqGen", sequenceName = "seq", initialValue = 1)
    private Long id;

    @Column(name = "column1")
    private String field1;
    @Column(name = "column2")
    private String field2;
    @Column(name = "column3")
    private String field3;
    @Column(name = "column4")
    private String field4;
    @Column(name = "column5")
    private String field5;
    @Column(name = "column6")
    private String field6;
    @Column(name = "column7")
    private String field7;
    @Column(name = "column8")
    private String field8;
    @Column(name = "column9")
    private String field9;
    @Column(name = "column10")
    private String field10;

    public UserFileRow() {
    }

    public UserFileRow(Long id, String field1, String field2, String field3, String field4, String field5,
                       String field6, String field7, String field8, String field9, String field10) {
        this.id = id;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.field6 = field6;
        this.field7 = field7;
        this.field8 = field8;
        this.field9 = field9;
        this.field10 = field10;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }

}
