#/bin/bash
# Kobweb version

VERSION=0.9.16
export JAVA_HOME="/home/makeevrserg/.jdks/corretto-17.0.13"

ENUM_TYPE_ESMP="web-app"

while getopts a: flag
do
    case "${flag}" in
        a) app=${OPTARG};;
    esac
done

if [[ $app == $ENUM_TYPE_ESMP ]]; then
    APP=$ENUM_TYPE_ESMP
else
  echo "Wrong app selected ($app)! Usage: -a <$ENUM_TYPE_ESMP>"
  exit 1
fi
echo "Selected app is $APP"

apt-get -y update; apt-get -y install curl; apt-get -y install unzip;
curl -LJO https://github.com/varabyte/kobweb-cli/releases/download/v$VERSION/kobweb-$VERSION.zip;

mv --force kobweb-$VERSION.zip build/kobweb-$VERSION.zip;
cd build
unzip -o kobweb-$VERSION.zip;
cd ..

KOBWEB_EXEC=$(pwd)/build/kobweb-$VERSION/bin/kobweb
echo $KOBWEB_EXEC
cd $APP;
$KOBWEB_EXEC stop;
$KOBWEB_EXEC run;