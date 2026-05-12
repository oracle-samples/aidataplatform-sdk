# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class IdentityDomainSummary(object):
    """
    A domain in the tenancy.
    """

    #: A constant which can be used with the lifecycle_state property of a IdentityDomainSummary.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a IdentityDomainSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a IdentityDomainSummary.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a IdentityDomainSummary.
    #: This constant has a value of "INACTIVE"
    LIFECYCLE_STATE_INACTIVE = "INACTIVE"

    def __init__(self, **kwargs):
        """
        Initializes a new IdentityDomainSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param domain_id:
            The value to assign to the domain_id property of this IdentityDomainSummary.
        :type domain_id: str

        :param domain_name:
            The value to assign to the domain_name property of this IdentityDomainSummary.
        :type domain_name: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this IdentityDomainSummary.
            Allowed values for this property are: "CREATING", "ACTIVE", "DELETING", "INACTIVE"
        :type lifecycle_state: str

        :param home_region_url:
            The value to assign to the home_region_url property of this IdentityDomainSummary.
        :type home_region_url: str

        """
        self.swagger_types = {
            'domain_id': 'str',
            'domain_name': 'str',
            'lifecycle_state': 'str',
            'home_region_url': 'str'
        }

        self.attribute_map = {
            'domain_id': 'domainId',
            'domain_name': 'domainName',
            'lifecycle_state': 'lifecycleState',
            'home_region_url': 'homeRegionUrl'
        }

        self._domain_id = None
        self._domain_name = None
        self._lifecycle_state = None
        self._home_region_url = None

    @property
    def domain_id(self):
        """
        Gets the domain_id of this IdentityDomainSummary.
        The ID of the domain.


        :return: The domain_id of this IdentityDomainSummary.
        :rtype: str
        """
        return self._domain_id

    @domain_id.setter
    def domain_id(self, domain_id):
        """
        Sets the domain_id of this IdentityDomainSummary.
        The ID of the domain.


        :param domain_id: The domain_id of this IdentityDomainSummary.
        :type: str
        """
        self._domain_id = domain_id

    @property
    def domain_name(self):
        """
        Gets the domain_name of this IdentityDomainSummary.
        The name of the domain.


        :return: The domain_name of this IdentityDomainSummary.
        :rtype: str
        """
        return self._domain_name

    @domain_name.setter
    def domain_name(self, domain_name):
        """
        Sets the domain_name of this IdentityDomainSummary.
        The name of the domain.


        :param domain_name: The domain_name of this IdentityDomainSummary.
        :type: str
        """
        self._domain_name = domain_name

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this IdentityDomainSummary.
        The current state of the domain in its lifecycle.

        Allowed values for this property are: "CREATING", "ACTIVE", "DELETING", "INACTIVE"


        :return: The lifecycle_state of this IdentityDomainSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this IdentityDomainSummary.
        The current state of the domain in its lifecycle.


        :param lifecycle_state: The lifecycle_state of this IdentityDomainSummary.
        :type: str
        """
        allowed_values = ["CREATING", "ACTIVE", "DELETING", "INACTIVE"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def home_region_url(self):
        """
        Gets the home_region_url of this IdentityDomainSummary.
        The primary region-specific URL for accessing the domain.


        :return: The home_region_url of this IdentityDomainSummary.
        :rtype: str
        """
        return self._home_region_url

    @home_region_url.setter
    def home_region_url(self, home_region_url):
        """
        Sets the home_region_url of this IdentityDomainSummary.
        The primary region-specific URL for accessing the domain.


        :param home_region_url: The home_region_url of this IdentityDomainSummary.
        :type: str
        """
        self._home_region_url = home_region_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
