# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MavenSearchSummary(object):
    """
    Maven package search result.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new MavenSearchSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param group_id:
            The value to assign to the group_id property of this MavenSearchSummary.
        :type group_id: str

        :param artifact_id:
            The value to assign to the artifact_id property of this MavenSearchSummary.
        :type artifact_id: str

        :param latest_version:
            The value to assign to the latest_version property of this MavenSearchSummary.
        :type latest_version: str

        :param all_versions:
            The value to assign to the all_versions property of this MavenSearchSummary.
        :type all_versions: list[str]

        :param freeform_tags:
            The value to assign to the freeform_tags property of this MavenSearchSummary.
        :type freeform_tags: dict(str, str)

        :param defined_tags:
            The value to assign to the defined_tags property of this MavenSearchSummary.
        :type defined_tags: dict(str, dict(str, object))

        :param system_tags:
            The value to assign to the system_tags property of this MavenSearchSummary.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'group_id': 'str',
            'artifact_id': 'str',
            'latest_version': 'str',
            'all_versions': 'list[str]',
            'freeform_tags': 'dict(str, str)',
            'defined_tags': 'dict(str, dict(str, object))',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'artifact_id': 'artifactId',
            'latest_version': 'latestVersion',
            'all_versions': 'allVersions',
            'freeform_tags': 'freeformTags',
            'defined_tags': 'definedTags',
            'system_tags': 'systemTags'
        }

        self._group_id = None
        self._artifact_id = None
        self._latest_version = None
        self._all_versions = None
        self._freeform_tags = None
        self._defined_tags = None
        self._system_tags = None

    @property
    def group_id(self):
        """
        Gets the group_id of this MavenSearchSummary.
        Maven group identifier.


        :return: The group_id of this MavenSearchSummary.
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """
        Sets the group_id of this MavenSearchSummary.
        Maven group identifier.


        :param group_id: The group_id of this MavenSearchSummary.
        :type: str
        """
        self._group_id = group_id

    @property
    def artifact_id(self):
        """
        Gets the artifact_id of this MavenSearchSummary.
        Maven artifact identifier.


        :return: The artifact_id of this MavenSearchSummary.
        :rtype: str
        """
        return self._artifact_id

    @artifact_id.setter
    def artifact_id(self, artifact_id):
        """
        Sets the artifact_id of this MavenSearchSummary.
        Maven artifact identifier.


        :param artifact_id: The artifact_id of this MavenSearchSummary.
        :type: str
        """
        self._artifact_id = artifact_id

    @property
    def latest_version(self):
        """
        Gets the latest_version of this MavenSearchSummary.
        Latest version reported for the Maven package.


        :return: The latest_version of this MavenSearchSummary.
        :rtype: str
        """
        return self._latest_version

    @latest_version.setter
    def latest_version(self, latest_version):
        """
        Sets the latest_version of this MavenSearchSummary.
        Latest version reported for the Maven package.


        :param latest_version: The latest_version of this MavenSearchSummary.
        :type: str
        """
        self._latest_version = latest_version

    @property
    def all_versions(self):
        """
        Gets the all_versions of this MavenSearchSummary.
        Available versions reported for the Maven package.


        :return: The all_versions of this MavenSearchSummary.
        :rtype: list[str]
        """
        return self._all_versions

    @all_versions.setter
    def all_versions(self, all_versions):
        """
        Sets the all_versions of this MavenSearchSummary.
        Available versions reported for the Maven package.


        :param all_versions: The all_versions of this MavenSearchSummary.
        :type: list[str]
        """
        self._all_versions = all_versions

    @property
    def freeform_tags(self):
        """
        Gets the freeform_tags of this MavenSearchSummary.
        Free-form tags for this Maven package search result.


        :return: The freeform_tags of this MavenSearchSummary.
        :rtype: dict(str, str)
        """
        return self._freeform_tags

    @freeform_tags.setter
    def freeform_tags(self, freeform_tags):
        """
        Sets the freeform_tags of this MavenSearchSummary.
        Free-form tags for this Maven package search result.


        :param freeform_tags: The freeform_tags of this MavenSearchSummary.
        :type: dict(str, str)
        """
        self._freeform_tags = freeform_tags

    @property
    def defined_tags(self):
        """
        Gets the defined_tags of this MavenSearchSummary.
        Defined tags for this Maven package search result.


        :return: The defined_tags of this MavenSearchSummary.
        :rtype: dict(str, dict(str, object))
        """
        return self._defined_tags

    @defined_tags.setter
    def defined_tags(self, defined_tags):
        """
        Sets the defined_tags of this MavenSearchSummary.
        Defined tags for this Maven package search result.


        :param defined_tags: The defined_tags of this MavenSearchSummary.
        :type: dict(str, dict(str, object))
        """
        self._defined_tags = defined_tags

    @property
    def system_tags(self):
        """
        Gets the system_tags of this MavenSearchSummary.
        System tags for this Maven package search result.


        :return: The system_tags of this MavenSearchSummary.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this MavenSearchSummary.
        System tags for this Maven package search result.


        :param system_tags: The system_tags of this MavenSearchSummary.
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
