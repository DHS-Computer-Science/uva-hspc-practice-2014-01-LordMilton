# Practice 2014 - 01: !terces poT

## Background
Saruman the White and his underling, Grima Wormtongue, communicate with each
other using a secret code, a language as twisted as their hearts. However, the
Rangers are very clever, and they realize that reversing each message will
reveal their adversary’s plotting. Aragorn has tasked you with decoding an
archive of their messages.

Given a message on each line, output the decoded message.

## Description

### Input
A series of encrpyted messages, one per line. A line with the 3-character string
”END” will indicate the end of input; this line should not be decoded, and
should not generate any output.

### Output
The list of decrypted messages, one per line.

## Sample
### Input
```
!edoc doog a tahW
noitacitsufbo
erafraw enirambus detcirtsernu yraurbeF fo tsrif eht no nigeb ot dnetni eW
lla sees rodroM fo drol eht ,ssertrof sih nihtiw delaecnoC
END
```

### Output
```
What a good code!
obfustication
We intend to begin on the first of February unrestricted submarine warfare
Concealed within his fortress, the lord of Mordor sees all
```
