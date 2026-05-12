# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UploadFileWithParDetails(object):
    """
    The data to create/update a file.
    """

    #: A constant which can be used with the action property of a UploadFileWithParDetails.
    #: This constant has a value of "CREATE"
    ACTION_CREATE = "CREATE"

    #: A constant which can be used with the action property of a UploadFileWithParDetails.
    #: This constant has a value of "REFRESH"
    ACTION_REFRESH = "REFRESH"

    #: A constant which can be used with the action property of a UploadFileWithParDetails.
    #: This constant has a value of "UPDATE"
    ACTION_UPDATE = "UPDATE"

    def __init__(self, **kwargs):
        """
        Initializes a new UploadFileWithParDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this UploadFileWithParDetails.
            Allowed values for this property are: "CREATE", "REFRESH", "UPDATE"
        :type action: str

        :param e_tag:
            The value to assign to the e_tag property of this UploadFileWithParDetails.
        :type e_tag: str

        :param size:
            The value to assign to the size property of this UploadFileWithParDetails.
        :type size: int

        :param system_tags:
            The value to assign to the system_tags property of this UploadFileWithParDetails.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'action': 'str',
            'e_tag': 'str',
            'size': 'int',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'action': 'action',
            'e_tag': 'eTag',
            'size': 'size',
            'system_tags': 'systemTags'
        }

        self._action = None
        self._e_tag = None
        self._size = None
        self._system_tags = None

    @property
    def action(self):
        """
        Gets the action of this UploadFileWithParDetails.
        Action type on create or close.

        Allowed values for this property are: "CREATE", "REFRESH", "UPDATE"


        :return: The action of this UploadFileWithParDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this UploadFileWithParDetails.
        Action type on create or close.


        :param action: The action of this UploadFileWithParDetails.
        :type: str
        """
        allowed_values = ["CREATE", "REFRESH", "UPDATE"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def e_tag(self):
        """
        Gets the e_tag of this UploadFileWithParDetails.
        Etag that needs to be updated.


        :return: The e_tag of this UploadFileWithParDetails.
        :rtype: str
        """
        return self._e_tag

    @e_tag.setter
    def e_tag(self, e_tag):
        """
        Sets the e_tag of this UploadFileWithParDetails.
        Etag that needs to be updated.


        :param e_tag: The e_tag of this UploadFileWithParDetails.
        :type: str
        """
        self._e_tag = e_tag

    @property
    def size(self):
        """
        Gets the size of this UploadFileWithParDetails.
        Size of the file needed when closed.


        :return: The size of this UploadFileWithParDetails.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size):
        """
        Sets the size of this UploadFileWithParDetails.
        Size of the file needed when closed.


        :param size: The size of this UploadFileWithParDetails.
        :type: int
        """
        self._size = size

    @property
    def system_tags(self):
        """
        Gets the system_tags of this UploadFileWithParDetails.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this UploadFileWithParDetails.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this UploadFileWithParDetails.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this UploadFileWithParDetails.
        :type: dict(str, dict(str, object))
        """
        self._system_tags = system_tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
