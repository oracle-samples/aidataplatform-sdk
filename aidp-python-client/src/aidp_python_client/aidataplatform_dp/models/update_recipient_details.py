# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateRecipientDetails(object):
    """
    The data to update a recipient.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateRecipientDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateRecipientDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateRecipientDetails.
        :type description: str

        :param properties:
            The value to assign to the properties property of this UpdateRecipientDetails.
        :type properties: dict(str, str)

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'properties': 'dict(str, str)'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'properties': 'properties'
        }

        self._display_name = None
        self._description = None
        self._properties = None

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateRecipientDetails.
        A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.


        :return: The display_name of this UpdateRecipientDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateRecipientDetails.
        A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.


        :param display_name: The display_name of this UpdateRecipientDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateRecipientDetails.
        Short description of the Recipient


        :return: The description of this UpdateRecipientDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateRecipientDetails.
        Short description of the Recipient


        :param description: The description of this UpdateRecipientDetails.
        :type: str
        """
        self._description = description

    @property
    def properties(self):
        """
        Gets the properties of this UpdateRecipientDetails.
        Key-value pair representing a defined tag key and value.
        Example: `{ \"CostCenter\": \"42\" }`


        :return: The properties of this UpdateRecipientDetails.
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this UpdateRecipientDetails.
        Key-value pair representing a defined tag key and value.
        Example: `{ \"CostCenter\": \"42\" }`


        :param properties: The properties of this UpdateRecipientDetails.
        :type: dict(str, str)
        """
        self._properties = properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
