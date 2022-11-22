
if [[ ! $(which java) ]] || [[ $(java -version 2>&1 | grep 1.8.0 | wc -l) == 0 ]] || [[ ! $(which mvn) ]]; then
    if [[ ! $(which sdk) ]]; then
        echo "Installing SDKman"
        chmod +x ./install_sdkman.sh
        ./install_sdkman.sh
        source "$HOME/.sdkman/bin/sdkman-init.sh"
    fi
    echo "Installing Java 8"
    sdk install java 8.0.352-tem
    sdk install maven
fi
