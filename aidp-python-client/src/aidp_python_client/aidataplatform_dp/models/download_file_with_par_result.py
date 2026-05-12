# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DownloadFileWithParResult(object):
    """
    Response object of generate PAR with download API.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DownloadFileWithParResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param par_url:
            The value to assign to the par_url property of this DownloadFileWithParResult.
        :type par_url: str

        :param e_tag:
            The value to assign to the e_tag property of this DownloadFileWithParResult.
        :type e_tag: str

        :param location_uri:
            The value to assign to the location_uri property of this DownloadFileWithParResult.
        :type location_uri: str

        :param size:
            The value to assign to the size property of this DownloadFileWithParResult.
        :type size: int

        :param created_by:
            The value to assign to the created_by property of this DownloadFileWithParResult.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this DownloadFileWithParResult.
        :type updated_by: str

        :param created_time:
            The value to assign to the created_time property of this DownloadFileWithParResult.
        :type created_time: str

        :param updated_time:
            The value to assign to the updated_time property of this DownloadFileWithParResult.
        :type updated_time: str

        :param description:
            The value to assign to the description property of this DownloadFileWithParResult.
        :type description: str

        :param system_tags:
            The value to assign to the system_tags property of this DownloadFileWithParResult.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'par_url': 'str',
            'e_tag': 'str',
            'location_uri': 'str',
            'size': 'int',
            'created_by': 'str',
            'updated_by': 'str',
            'created_time': 'str',
            'updated_time': 'str',
            'description': 'str',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'par_url': 'parUrl',
            'e_tag': 'eTag',
            'location_uri': 'locationUri',
            'size': 'size',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'created_time': 'createdTime',
            'updated_time': 'updatedTime',
            'description': 'description',
            'system_tags': 'systemTags'
        }

        self._par_url = None
        self._e_tag = None
        self._location_uri = None
        self._size = None
        self._created_by = None
        self._updated_by = None
        self._created_time = None
        self._updated_time = None
        self._description = None
        self._system_tags = None

    @property
    def par_url(self):
        """
        Gets the par_url of this DownloadFileWithParResult.
        String representing the PAR URL.


        :return: The par_url of this DownloadFileWithParResult.
        :rtype: str
        """
        return self._par_url

    @par_url.setter
    def par_url(self, par_url):
        """
        Sets the par_url of this DownloadFileWithParResult.
        String representing the PAR URL.


        :param par_url: The par_url of this DownloadFileWithParResult.
        :type: str
        """
        self._par_url = par_url

    @property
    def e_tag(self):
        """
        **[Required]** Gets the e_tag of this DownloadFileWithParResult.
        Etag after creating or closing a file.


        :return: The e_tag of this DownloadFileWithParResult.
        :rtype: str
        """
        return self._e_tag

    @e_tag.setter
    def e_tag(self, e_tag):
        """
        Sets the e_tag of this DownloadFileWithParResult.
        Etag after creating or closing a file.


        :param e_tag: The e_tag of this DownloadFileWithParResult.
        :type: str
        """
        self._e_tag = e_tag

    @property
    def location_uri(self):
        """
        **[Required]** Gets the location_uri of this DownloadFileWithParResult.
        The object storage URI which has bucket and namespace information.


        :return: The location_uri of this DownloadFileWithParResult.
        :rtype: str
        """
        return self._location_uri

    @location_uri.setter
    def location_uri(self, location_uri):
        """
        Sets the location_uri of this DownloadFileWithParResult.
        The object storage URI which has bucket and namespace information.


        :param location_uri: The location_uri of this DownloadFileWithParResult.
        :type: str
        """
        self._location_uri = location_uri

    @property
    def size(self):
        """
        **[Required]** Gets the size of this DownloadFileWithParResult.
        File size in bytes.


        :return: The size of this DownloadFileWithParResult.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size):
        """
        Sets the size of this DownloadFileWithParResult.
        File size in bytes.


        :param size: The size of this DownloadFileWithParResult.
        :type: int
        """
        self._size = size

    @property
    def created_by(self):
        """
        Gets the created_by of this DownloadFileWithParResult.
        The user who created the file.


        :return: The created_by of this DownloadFileWithParResult.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this DownloadFileWithParResult.
        The user who created the file.


        :param created_by: The created_by of this DownloadFileWithParResult.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this DownloadFileWithParResult.
        The user who last updated the file.


        :return: The updated_by of this DownloadFileWithParResult.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this DownloadFileWithParResult.
        The user who last updated the file.


        :param updated_by: The updated_by of this DownloadFileWithParResult.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def created_time(self):
        """
        Gets the created_time of this DownloadFileWithParResult.
        The time at which the file was created.


        :return: The created_time of this DownloadFileWithParResult.
        :rtype: str
        """
        return self._created_time

    @created_time.setter
    def created_time(self, created_time):
        """
        Sets the created_time of this DownloadFileWithParResult.
        The time at which the file was created.


        :param created_time: The created_time of this DownloadFileWithParResult.
        :type: str
        """
        self._created_time = created_time

    @property
    def updated_time(self):
        """
        Gets the updated_time of this DownloadFileWithParResult.
        The last modified time of the file.


        :return: The updated_time of this DownloadFileWithParResult.
        :rtype: str
        """
        return self._updated_time

    @updated_time.setter
    def updated_time(self, updated_time):
        """
        Sets the updated_time of this DownloadFileWithParResult.
        The last modified time of the file.


        :param updated_time: The updated_time of this DownloadFileWithParResult.
        :type: str
        """
        self._updated_time = updated_time

    @property
    def description(self):
        """
        Gets the description of this DownloadFileWithParResult.
        The file description.


        :return: The description of this DownloadFileWithParResult.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this DownloadFileWithParResult.
        The file description.


        :param description: The description of this DownloadFileWithParResult.
        :type: str
        """
        self._description = description

    @property
    def system_tags(self):
        """
        Gets the system_tags of this DownloadFileWithParResult.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this DownloadFileWithParResult.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this DownloadFileWithParResult.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this DownloadFileWithParResult.
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
