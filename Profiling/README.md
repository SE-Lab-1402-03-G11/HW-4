# بخش اول
ابتدا کلاس JavaCup را با استفاده از yourkit بررسی می‌کنیم.

![عکس تلمتری](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/1/before/telemetry.png)
![متد قبل](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/1/before/method.png)

همان‌طور که مشخص است برنامه کرش می‌کند و بعد از تابع main که اصلی‌ترین است، مهم‌ترین تابعی که منابع را مصرف می‌کند تابع temp است. حال ما باید کد این تابع را طوری تغییر بدهیم که دیگر این مشکل به وجود نیاید.

![کد](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/1/code.png)
همان‌طور که ملاحظه می‌کنید به‌جای اینکه یک arraylist بسازیم و مدام به آن add کنیم، یک آرایه می‌سازیم و از قبل سایزش را هم می‌دهیم. به جای فراخوانی تابعی مثل add مقدار آرایه در آن اندیس خاص را تغییر می‌دهیم.

پس از این تغییر مشاهده می‌کنید که مشکلات قبلی دیگر رخ نمی‌دهند.

![تلمتری دوم](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/1/after/telemetry.png)


![متد دوم](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/1/after/method.png)

# بخش دوم
کلاس DFS را به برنامه اضافه می‌کنیم. ابتدا، در این کلاس پیاده‌سازی غیربهینه‌ای از dfs انجام دادیم که پروفایلینگ آن را در عکس‌های زیر مشاهده می‌کنید.

![تلمتری دوم](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/2/before/method.png)

![تلمتری دوم](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/2/before/memory.png)

سپس کد را تغییر می‌دهیم و بخش‌هایی از آن که غیربهینه بودند را درست می‌کنیم. تصاویر پروفایلینگ کد اصلاح‌شده در قسمت زیر است:

![تلمتری دوم](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/2/after/method.png)

![تلمتری دوم](https://github.com/SE-Lab-1402-03-G11/HW-4/blob/BehzadNabavi/Features/ProfilingTest/Profiling/pictures/2/after/memory.png)

بهبود عملکرد کد از مقایسهٔ دو عکس پیدا است. بهبودهایی که در کد خود دادیم، شامل حذف آرایه‌های بازگشتی عمیق، حذف HashSetهای تکراری، استفاده‌کردن از استک و استفاده‌کردن از ArrayList برای لیست مجاورت می‌باشد.