# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ImportComputeConfigurationDetails(object):
    """
    Workspace YAML files to import into an active Spark Compute.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ImportComputeConfigurationDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param yaml_paths:
            The value to assign to the yaml_paths property of this ImportComputeConfigurationDetails.
        :type yaml_paths: list[str]

        """
        self.swagger_types = {
            'yaml_paths': 'list[str]'
        }

        self.attribute_map = {
            'yaml_paths': 'yamlPaths'
        }

        self._yaml_paths = None

    @property
    def yaml_paths(self):
        """
        **[Required]** Gets the yaml_paths of this ImportComputeConfigurationDetails.
        Non-empty, unique workspace or volume paths ending in .yaml. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....


        :return: The yaml_paths of this ImportComputeConfigurationDetails.
        :rtype: list[str]
        """
        return self._yaml_paths

    @yaml_paths.setter
    def yaml_paths(self, yaml_paths):
        """
        Sets the yaml_paths of this ImportComputeConfigurationDetails.
        Non-empty, unique workspace or volume paths ending in .yaml. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....


        :param yaml_paths: The yaml_paths of this ImportComputeConfigurationDetails.
        :type: list[str]
        """
        self._yaml_paths = yaml_paths

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
