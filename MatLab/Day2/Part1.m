clear
sum = 0;
fid = fopen('input.txt');
tline = fgetl(fid);
while ischar(tline)
    %disp(tline)
    data = split(tline, 'x');
    a = str2num(data{1});
    b = str2num(data{2});
    c = str2num(data{3});


    sum = sum + (2*a*b + 2*a*c + 2*b*c);

    sum = sum + min([a*b a*c b*c]);

    tline = fgetl(fid);
    
end
fclose(fid);
disp(sum)

