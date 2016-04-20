begin

update LOCALEPROFILE a
set a.ACTIVESW = 1, a.USEDBYLOGONSW = 1;

COMMIT;
end;