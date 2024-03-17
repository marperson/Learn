# ansible
Anything related to Ansible

## setup
* Ansible + Docker might not work on an Oracle Virtual box as main machine. If install Ubuntu withour virtual box it works
* edit /etc/ansible/ansible.cfg, add configuraiton
* update hosts file in above location or local, use -i to refer new location

```sh
sudo ansible all -m ping
sudo ansible all -i ~/hosts -m ping
```

###
