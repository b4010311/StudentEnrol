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



def student1= new Student( name:'Frank Sekyere',

studentid: 'B4019796',

dob: ('19/04/1995'),

email: 'B4019796@my.shu.ac.uk',

username: 'F.Sekyere',

password: 'password',

course: 'Computing').save()


def student2= new Student( name:'Shabaz Khalid',

studentid: 'B4010311',

dob: ('15/02/1996'),

email: 'B4010311@my.shu.ac.uk',

username: 'S.Khalid',

password: 'password',

course: 'Computing').save()


def lecturer1= new Lecturer( name:'Tonderai',

post: 'Anything',

email: 'Tonderai@my.shu.ac.uk',

department: 'Computing',

subject: 'Web Architectures',

research: 'Anything').save()


def lecturer2= new Lecturer( name:'Steve',

post: 'SAP',

email: 'Steve@my.shu.ac.uk',

department: 'Computing',

subject: 'Enterprise Information Systems',

research: 'SAP').save()


def leader1= new Leader( fullName:'Dr Anne Roberts',

post: 'Senior Lecturer',

subject: 'Animation',

email: 'a.d.roberts@theUni.ac.uk',

office: 'Room 1234',

bio: '''Lorem ipsum dolor sit amet, an ullum epicurei definitionem''').save()


def leader2= new Leader( fullName:'Tonderai',

post: 'Senior Lecturer',

subject: 'Web Architectures',

email: 'Tonderai@theUni.ac.uk',

office: 'Room 5231',

bio: '''Lorem ipsum dolor sit amet, an ullum epicurei definitionem''').save()


def leader3= new Leader( fullName:'Lynne Dawson',

post: 'Senior Lecturer',

subject: 'Enterprise Information Systems',

email: 'l.dawson@theUni.ac.uk',

office: 'Room 5231',

bio: '''Lorem ipsum dolor sit amet, an ullum epicurei definitionem''').save()


def module1 = new Module( title: 'Web Architectures',

code: 'WA234',

credits: 5,

lecturer:'Dr Steve Crossbar',

description: '''Lorem ipsum dolor sit amet, ludus contentiones ut nam, quaeque dolores facilisi in nec''').save()


    }

    def destroy = {

    }
}
