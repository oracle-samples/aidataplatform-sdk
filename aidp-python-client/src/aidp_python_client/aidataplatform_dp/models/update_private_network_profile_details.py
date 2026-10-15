# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdatePrivateNetworkProfileDetails(object):
    """
    Fields for updating a reusable Git private network profile.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdatePrivateNetworkProfileDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this UpdatePrivateNetworkProfileDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this UpdatePrivateNetworkProfileDetails.
        :type description: str

        :param customer_compartment_id:
            The value to assign to the customer_compartment_id property of this UpdatePrivateNetworkProfileDetails.
        :type customer_compartment_id: str

        :param customer_vcn_id:
            The value to assign to the customer_vcn_id property of this UpdatePrivateNetworkProfileDetails.
        :type customer_vcn_id: str

        :param customer_subnet_id:
            The value to assign to the customer_subnet_id property of this UpdatePrivateNetworkProfileDetails.
        :type customer_subnet_id: str

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'customer_compartment_id': 'str',
            'customer_vcn_id': 'str',
            'customer_subnet_id': 'str'
        }
        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'customer_compartment_id': 'customerCompartmentId',
            'customer_vcn_id': 'customerVcnId',
            'customer_subnet_id': 'customerSubnetId'
        }
        self._name = None
        self._description = None
        self._customer_compartment_id = None
        self._customer_vcn_id = None
        self._customer_subnet_id = None

    @property
    def name(self):
        """
        Gets the name of this UpdatePrivateNetworkProfileDetails.
        Updated display name of the Git connectivity profile.


        :return: The name of this UpdatePrivateNetworkProfileDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdatePrivateNetworkProfileDetails.
        Updated display name of the Git connectivity profile.


        :param name: The name of this UpdatePrivateNetworkProfileDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this UpdatePrivateNetworkProfileDetails.
        Updated profile description. An empty value clears the description.


        :return: The description of this UpdatePrivateNetworkProfileDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdatePrivateNetworkProfileDetails.
        Updated profile description. An empty value clears the description.


        :param description: The description of this UpdatePrivateNetworkProfileDetails.
        :type: str
        """
        self._description = description

    @property
    def customer_compartment_id(self):
        """
        Gets the customer_compartment_id of this UpdatePrivateNetworkProfileDetails.
        Updated customer compartment identifier containing the private network resources.


        :return: The customer_compartment_id of this UpdatePrivateNetworkProfileDetails.
        :rtype: str
        """
        return self._customer_compartment_id

    @customer_compartment_id.setter
    def customer_compartment_id(self, customer_compartment_id):
        """
        Sets the customer_compartment_id of this UpdatePrivateNetworkProfileDetails.
        Updated customer compartment identifier containing the private network resources.


        :param customer_compartment_id: The customer_compartment_id of this UpdatePrivateNetworkProfileDetails.
        :type: str
        """
        self._customer_compartment_id = customer_compartment_id

    @property
    def customer_vcn_id(self):
        """
        Gets the customer_vcn_id of this UpdatePrivateNetworkProfileDetails.
        Updated customer VCN identifier used for Git connectivity.


        :return: The customer_vcn_id of this UpdatePrivateNetworkProfileDetails.
        :rtype: str
        """
        return self._customer_vcn_id

    @customer_vcn_id.setter
    def customer_vcn_id(self, customer_vcn_id):
        """
        Sets the customer_vcn_id of this UpdatePrivateNetworkProfileDetails.
        Updated customer VCN identifier used for Git connectivity.


        :param customer_vcn_id: The customer_vcn_id of this UpdatePrivateNetworkProfileDetails.
        :type: str
        """
        self._customer_vcn_id = customer_vcn_id

    @property
    def customer_subnet_id(self):
        """
        Gets the customer_subnet_id of this UpdatePrivateNetworkProfileDetails.
        Updated customer subnet identifier used for Git connectivity.


        :return: The customer_subnet_id of this UpdatePrivateNetworkProfileDetails.
        :rtype: str
        """
        return self._customer_subnet_id

    @customer_subnet_id.setter
    def customer_subnet_id(self, customer_subnet_id):
        """
        Sets the customer_subnet_id of this UpdatePrivateNetworkProfileDetails.
        Updated customer subnet identifier used for Git connectivity.


        :param customer_subnet_id: The customer_subnet_id of this UpdatePrivateNetworkProfileDetails.
        :type: str
        """
        self._customer_subnet_id = customer_subnet_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
