# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WorkspaceNetworkConfigurationDetails(object):
    """
    Private network configuration details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new WorkspaceNetworkConfigurationDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param subnet_id:
            The value to assign to the subnet_id property of this WorkspaceNetworkConfigurationDetails.
        :type subnet_id: str

        :param nsg_ids:
            The value to assign to the nsg_ids property of this WorkspaceNetworkConfigurationDetails.
        :type nsg_ids: list[str]

        :param dns_zones:
            The value to assign to the dns_zones property of this WorkspaceNetworkConfigurationDetails.
        :type dns_zones: list[str]

        :param scan_details:
            The value to assign to the scan_details property of this WorkspaceNetworkConfigurationDetails.
        :type scan_details: list[oci.aidataplatform_dp.models.Scan]

        """
        self.swagger_types = {
            'subnet_id': 'str',
            'nsg_ids': 'list[str]',
            'dns_zones': 'list[str]',
            'scan_details': 'list[Scan]'
        }

        self.attribute_map = {
            'subnet_id': 'subnetId',
            'nsg_ids': 'nsgIds',
            'dns_zones': 'dnsZones',
            'scan_details': 'scanDetails'
        }

        self._subnet_id = None
        self._nsg_ids = None
        self._dns_zones = None
        self._scan_details = None

    @property
    def subnet_id(self):
        """
        Gets the subnet_id of this WorkspaceNetworkConfigurationDetails.
        The OCID of a subnet.


        :return: The subnet_id of this WorkspaceNetworkConfigurationDetails.
        :rtype: str
        """
        return self._subnet_id

    @subnet_id.setter
    def subnet_id(self, subnet_id):
        """
        Sets the subnet_id of this WorkspaceNetworkConfigurationDetails.
        The OCID of a subnet.


        :param subnet_id: The subnet_id of this WorkspaceNetworkConfigurationDetails.
        :type: str
        """
        self._subnet_id = subnet_id

    @property
    def nsg_ids(self):
        """
        Gets the nsg_ids of this WorkspaceNetworkConfigurationDetails.
        An array of network security group OCIDs.


        :return: The nsg_ids of this WorkspaceNetworkConfigurationDetails.
        :rtype: list[str]
        """
        return self._nsg_ids

    @nsg_ids.setter
    def nsg_ids(self, nsg_ids):
        """
        Sets the nsg_ids of this WorkspaceNetworkConfigurationDetails.
        An array of network security group OCIDs.


        :param nsg_ids: The nsg_ids of this WorkspaceNetworkConfigurationDetails.
        :type: list[str]
        """
        self._nsg_ids = nsg_ids

    @property
    def dns_zones(self):
        """
        Gets the dns_zones of this WorkspaceNetworkConfigurationDetails.
        An array of fully qualified domain names to whitelist for workspace network access.
        Example: `[ \"app.examplecorp.com\", \"app.examplecorp2.com\" ]`


        :return: The dns_zones of this WorkspaceNetworkConfigurationDetails.
        :rtype: list[str]
        """
        return self._dns_zones

    @dns_zones.setter
    def dns_zones(self, dns_zones):
        """
        Sets the dns_zones of this WorkspaceNetworkConfigurationDetails.
        An array of fully qualified domain names to whitelist for workspace network access.
        Example: `[ \"app.examplecorp.com\", \"app.examplecorp2.com\" ]`


        :param dns_zones: The dns_zones of this WorkspaceNetworkConfigurationDetails.
        :type: list[str]
        """
        self._dns_zones = dns_zones

    @property
    def scan_details(self):
        """
        Gets the scan_details of this WorkspaceNetworkConfigurationDetails.
        An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
        [ { fqdn: \"scan1.oracle.com\", port: \"1521\"}, { fqdn: \"scan2.oracle.com\", port: \"1521\" } ]


        :return: The scan_details of this WorkspaceNetworkConfigurationDetails.
        :rtype: list[oci.aidataplatform_dp.models.Scan]
        """
        return self._scan_details

    @scan_details.setter
    def scan_details(self, scan_details):
        """
        Sets the scan_details of this WorkspaceNetworkConfigurationDetails.
        An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
        [ { fqdn: \"scan1.oracle.com\", port: \"1521\"}, { fqdn: \"scan2.oracle.com\", port: \"1521\" } ]


        :param scan_details: The scan_details of this WorkspaceNetworkConfigurationDetails.
        :type: list[oci.aidataplatform_dp.models.Scan]
        """
        self._scan_details = scan_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
