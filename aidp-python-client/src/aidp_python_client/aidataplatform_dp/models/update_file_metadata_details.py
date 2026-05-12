# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateFileMetadataDetails(object):
    """
    The metadata information.
    """

    #: A constant which can be used with the action property of a UpdateFileMetadataDetails.
    #: This constant has a value of "UPDATE"
    ACTION_UPDATE = "UPDATE"

    #: A constant which can be used with the action property of a UpdateFileMetadataDetails.
    #: This constant has a value of "APPEND"
    ACTION_APPEND = "APPEND"

    #: A constant which can be used with the action property of a UpdateFileMetadataDetails.
    #: This constant has a value of "REPLACE"
    ACTION_REPLACE = "REPLACE"

    #: A constant which can be used with the action property of a UpdateFileMetadataDetails.
    #: This constant has a value of "RESET"
    ACTION_RESET = "RESET"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateFileMetadataDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param metadata:
            The value to assign to the metadata property of this UpdateFileMetadataDetails.
        :type metadata: dict(str, str)

        :param action:
            The value to assign to the action property of this UpdateFileMetadataDetails.
            Allowed values for this property are: "UPDATE", "APPEND", "REPLACE", "RESET"
        :type action: str

        """
        self.swagger_types = {
            'metadata': 'dict(str, str)',
            'action': 'str'
        }

        self.attribute_map = {
            'metadata': 'metadata',
            'action': 'action'
        }

        self._metadata = None
        self._action = None

    @property
    def metadata(self):
        """
        Gets the metadata of this UpdateFileMetadataDetails.
        The metadata information in map form. Example entries include system:key1=val1 and user:key2=val1.


        :return: The metadata of this UpdateFileMetadataDetails.
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """
        Sets the metadata of this UpdateFileMetadataDetails.
        The metadata information in map form. Example entries include system:key1=val1 and user:key2=val1.


        :param metadata: The metadata of this UpdateFileMetadataDetails.
        :type: dict(str, str)
        """
        self._metadata = metadata

    @property
    def action(self):
        """
        **[Required]** Gets the action of this UpdateFileMetadataDetails.
        Action to be taken in case of conflict.

        Allowed values for this property are: "UPDATE", "APPEND", "REPLACE", "RESET"


        :return: The action of this UpdateFileMetadataDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this UpdateFileMetadataDetails.
        Action to be taken in case of conflict.


        :param action: The action of this UpdateFileMetadataDetails.
        :type: str
        """
        allowed_values = ["UPDATE", "APPEND", "REPLACE", "RESET"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
