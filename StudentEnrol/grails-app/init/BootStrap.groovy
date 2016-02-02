import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->

def course1= new Course( title:'Interactive Media with Animation',

department: 'Computing',

description: '''Lorem ipsum dolar sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',

leader:'Joe Jojo',

code: 'IMA101',

startDate: new Date('19/01/2015'),

endDate: new Date('19/01/2020')).save()

def course2= new Course( title:'Web Architectures',

department: 'Computing',

description: '''Very interesting module, Using Linux and VMware Workstation, very good, mel reque corpora vulputate ei.''',

leader:'Tonderai',

code: 'WEB106',

startDate: new Date('19/01/2015'),

endDate: new Date('19/01/2016')).save()

def course3= new Course( title:'Enterprise Information Systems',

department: 'Computing',

description: '''SAP, SAP, SAP, SAP and SAP.''',

leader:'Steve',

code: 'EIS105',

startDate: new Date('19/01/2016'),

endDate: new Date('19/01/2017')).save()

    }

    def destroy = {

    }
}
