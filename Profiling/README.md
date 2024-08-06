# بخش اول
ابتدا کلاس جاواکاپ را با استفاده از yourkit بررسی می‌کنیم.

![عکس تلمتری](/Users/behzad/Documents/GitHub/HW-4/Profiling/pictures/1/before/telemetry.png)

![متد قبل](/Users/behzad/Documents/GitHub/HW-4/Profiling/pictures/1/before/method.png)

همان‌طور که مشخص است برنامه کرش می‌کند و بعد از تابع main که اصلی‌ترین است، مهم‌ترین تابعی که منابع را مصرف می‌کند تابع temp است. حال ما باید کد این تابع را طوری تغییر بدهیم که دیگر این مشکل به وجود نیاید.

![کد](/Users/behzad/Documents/GitHub/HW-4/Profiling/pictures/1/code.png)

همان‌طور که ملاحظه می‌کنید به‌جای اینکه یک arraylist بسازیم و مدام به آن add کنیم، یک آرایه می‌سازیم و از قبل سایزش را هم می‌دهیم. به جای فراخوانی تابعی مثل add مقدار آرایه در آن اندیس خاص را تغییر می‌دهیم.

پس از این تغییر مشاهده می‌کنید که مشکلات قبلی دیگر رخ نمی‌دهند.

![تلمتری دوم](/Users/behzad/Documents/GitHub/HW-4/Profiling/pictures/1/after/telemetry.png)


![متد دوم](/Users/behzad/Documents/GitHub/HW-4/Profiling/pictures/1/after/method.png)