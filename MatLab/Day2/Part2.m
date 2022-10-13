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

    sum = sum + a * b * c;

    if a <= c && b <= c %a,b
        sum = sum + 2 * a + 2 * b;
    elseif b <= a && c <= a %b,c
        sum = sum + 2 * b + 2 * c;
    else %a,c
        sum = sum + 2 * a + 2 * c;
    end

    tline = fgetl(fid);

end
fclose(fid);
disp(sum)

