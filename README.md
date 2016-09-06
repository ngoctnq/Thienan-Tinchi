# Đăng ký tín chỉ qua hệ thống Thiên An
bởi một bạn đẹp trai vừa phải có biệt danh `DreAms // UNDRLVND`.

###### UPDATE - READ THIS // I DON'T HAVE UNIKEY LUL
    Since the Firefox > 46.0, Selenium 2 and older will NOT work. Try finding old Selenium jars and use it with older versions of Firefox. Personally I can't even find a link for the old jars, just had in cached in my directory... somewhere.

## Giới thiệu chung
Đây là một con bot Java nho nhỏ xinh xinh, chạy dựa trên API của Selenium, giúp bạn auto F5 lỡ sập mạng và đăng ký lớp. Đã thử trên hệ thống HNUE, tuy nhiên theo lý thuyết sẽ hoạt động trên các trang web của các trường khác, miễn là format tương tự hệ thống của Thiên An.

Tiện thể nếu Thiên An đang đọc cái này, làm ơn nâng cấp hệ thống SQL để sinh viên không cần phải dùng script này...

## Cách sử dụng
#### 0.5. Tải và update Firefox.

Nếu bạn thích nghịch, hãy sửa source code và compile lại - Selenium có binding cho IE, Firefox, Chrome, Opera, Safari, nói chung là đủ cả.

#### 1. Tải file `Firefox_Tinchi.class` và `input.txt` về.

Để chúng ở chung 1 folder cùng với tất cả các file sau này.

*File `Firefox_Tinchi.java` không cần thiết nếu bạn chỉ đinh chạy chứ không tìm hiểu/sửa đổi - nó là sourcecode, được upload chỉ nhằm mục đích để các bạn nếu muốn có thể tự tìm hiểu code này hoạt động như thế nào.*
#### 2. Tải file batch về.

Nếu bạn dùng Windows, hãy tải file `run.bat`. Nếu bạn dùng Mac/Linux, mình lười viết batch file và test lắm nên các bạn tự run from source ở bước 6 nhé: `cd [folder_chứa_file]; javac -cp "*:." Firefox_Tinchi`.

*Trong file đó chỉ có dòng lệnh chạy `javac`, nó giúp người dùng không cần `cd`.*

#### 3. Tải 2 file `jar` của Selenium về.

Bạn vào trang web sau: http://www.seleniumhq.org/download/. Sau đó các bạn tải file server và client bằng cách click vào 2 link như hướng dẫn dưới đây:

![alt text](http://i.imgur.com/pYMLYKk.png "Bạn mà không tự tải được nữa thì mình cũng chịu rồi đấy.")

*Các bạn nhớ tải 2 file đó về cùng folder cũ.*

#### 4. Tải và cài đặt Java Runtime Environment.

Bạn vào trang web sau: https://java.com/en/download/. Sau đó, tải và cài đặt như bình thường.

#### 5. Sửa file `input.txt` theo  đúng nhu cầu của bạn.

Ở dòng 2 bạn thay số cho sẵn bằng mã học sinh của bạn, dòng 4 để password account, và từ dòng 6 trở đi là mã lớp như ví dụ. Đừng thêm dòng trống hoặc ký tự thừa, code mình không thông minh đến thế đâu.

*Mình không gửi password các bạn đi đâu đâu, nếu còn nghi các bạn có thể check sourcecode và compile lại từ đàu.*

#### 6. Chạy file batch.

Nếu bạn chạy Windows thì nhấp đúp vào file `run.bat`, còn không các bạn cố gắng tự gõ dòng lệnh mình đính kèm trên bước 6 nhé. Nếu bạn vẫn không chạy được thì có gì email mình rồi mình làm video hướng dẫn tạm vậy... cơ mà dùng Windows đi.

## Công trạng // Chú thích
Mình tự viết code này cho một thằng bạn, và nó cho mình mượn acc để test. Các bạn muốn làm gì thì làm cơ mà mình không chịu trách nhiệm gì đâu nhé.

Nếu có bug hoạt không hoạt động các bạn có thể mở một issue ticket ngay trên GitHub, hoặc email mình tại `ngoc@underlandian.com`.
