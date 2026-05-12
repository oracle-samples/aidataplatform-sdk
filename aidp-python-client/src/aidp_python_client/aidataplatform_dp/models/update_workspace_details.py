# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateWorkspaceDetails(object):
    """
    The data to update a workspace.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateWorkspaceDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateWorkspaceDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateWorkspaceDetails.
        :type description: str

        :param default_catalog_key:
            The value to assign to the default_catalog_key property of this UpdateWorkspaceDetails.
        :type default_catalog_key: str

        :param network_configuration_details:
            The value to assign to the network_configuration_details property of this UpdateWorkspaceDetails.
        :type network_configuration_details: oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'default_catalog_key': 'str',
            'network_configuration_details': 'WorkspaceNetworkConfigurationDetails'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'default_catalog_key': 'defaultCatalogKey',
            'network_configuration_details': 'networkConfigurationDetails'
        }

        self._display_name = None
        self._description = None
        self._default_catalog_key = None
        self._network_configuration_details = None

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateWorkspaceDetails.
        A user-friendly name that has to be unique in a AI Data Platform Workbench instance.


        :return: The display_name of this UpdateWorkspaceDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateWorkspaceDetails.
        A user-friendly name that has to be unique in a AI Data Platform Workbench instance.


        :param display_name: The display_name of this UpdateWorkspaceDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateWorkspaceDetails.
        Description of the workspace.


        :return: The description of this UpdateWorkspaceDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateWorkspaceDetails.
        Description of the workspace.


        :param description: The description of this UpdateWorkspaceDetails.
        :type: str
        """
        self._description = description

    @property
    def default_catalog_key(self):
        """
        Gets the default_catalog_key of this UpdateWorkspaceDetails.
        The key of the catalog to be used as the default catalog for this workspace.
        A default catalog in the workspace will allow users to use that
        catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
        schema1 and table1, you can refer to the table in a notebook using: schema1.table1.


        :return: The default_catalog_key of this UpdateWorkspaceDetails.
        :rtype: str
        """
        return self._default_catalog_key

    @default_catalog_key.setter
    def default_catalog_key(self, default_catalog_key):
        """
        Sets the default_catalog_key of this UpdateWorkspaceDetails.
        The key of the catalog to be used as the default catalog for this workspace.
        A default catalog in the workspace will allow users to use that
        catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
        schema1 and table1, you can refer to the table in a notebook using: schema1.table1.


        :param default_catalog_key: The default_catalog_key of this UpdateWorkspaceDetails.
        :type: str
        """
        self._default_catalog_key = default_catalog_key

    @property
    def network_configuration_details(self):
        """
        Gets the network_configuration_details of this UpdateWorkspaceDetails.

        :return: The network_configuration_details of this UpdateWorkspaceDetails.
        :rtype: oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails
        """
        return self._network_configuration_details

    @network_configuration_details.setter
    def network_configuration_details(self, network_configuration_details):
        """
        Sets the network_configuration_details of this UpdateWorkspaceDetails.

        :param network_configuration_details: The network_configuration_details of this UpdateWorkspaceDetails.
        :type: oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails
        """
        self._network_configuration_details = network_configuration_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
